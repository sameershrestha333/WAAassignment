package com.example.bean;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class MyPhaseListener  implements PhaseListener{

	@Override
	public void afterPhase(PhaseEvent event) {
		//it runs after a phase
		System.out.println("after::::"+event.getPhaseId());
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		//it runs before a phase
				System.out.println("before::::"+event.getPhaseId());
		
	}

	@Override
	public PhaseId getPhaseId() {
		
		return PhaseId.ANY_PHASE;
	}

}
