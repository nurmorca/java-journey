package p_1;

import java.util.*;
import java.util.Map.Entry;

public class ProcessManager implements lProcessManager {
	
	private int used_memory_size;
	private int max_memory_size;
	private HashMap<String, Process> processMaps;
	private LinkedList<Process> waitingProcessList;
	
	public ProcessManager(int max_memory_size) {
		this.max_memory_size = max_memory_size;
		this.used_memory_size = 0;
		this.processMaps = new HashMap<String, Process>();
		this.waitingProcessList = new LinkedList<>();
	}


	public int getUsed_memory_size() {		
		return used_memory_size;
	}

	
	public boolean add_process(User u, String processName, int required_memory) {
		if(this.used_memory_size + required_memory <= this.max_memory_size) {
			this.processMaps.put(processName, new Process(processName, required_memory, u));
			used_memory_size += required_memory;
			return true;
		} else {
			if(processMaps.containsKey(processName) == false) {
				this.waitingProcessList.add(new Process(processName, required_memory, u));	
			}		
		}
		return false;
	}


	public boolean remove_process(String name) throws Exception {
		if(this.processMaps.containsKey(name) == false) {
			throw new Exception("process cannot found!");
		} else {
			int added = 0;
			Process indexes[] = new Process[waitingProcessList.size()];
			used_memory_size = used_memory_size - processMaps.get(name).getRequired_memory();
			this.processMaps.remove(name);
			for(Process p : waitingProcessList) {
				if(p.getRequired_memory() + used_memory_size <= max_memory_size) {
					add_process(p.getUser(), p.getName(), p.getRequired_memory());
					indexes[added] = p;
					added++;
				}								
			}
			if(added != 0) {				
				for(int i = 0; i < added; i++) {
					waitingProcessList.remove(indexes[i]);
				}
			}
			
		}		
		return true;
	}


	public void print_processes() {
		for(Entry<String, Process> p : processMaps.entrySet()) {
			System.out.println(p.getKey() + " = " + p.getValue());	
		}		
	}


	public void print_waiting_processes() {
		for(Process p : this.waitingProcessList) {
			System.out.println(p.getName());
		}
	
		
	}
	
	
	
	
	

}
