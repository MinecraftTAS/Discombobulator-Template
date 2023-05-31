package com.minecrafttas.disco_template;

import net.fabricmc.api.ModInitializer;

public class ModContainer implements ModInitializer{

	@Override
	public void onInitialize() {
		System.out.println("Hello Disco World!");
		
		//////////////////////////////////
		// To do version specific code: //
		//////////////////////////////////
		
		//#1.10.2
//$$		System.out.println("Only enabled in 1.10.2 and below");
		//#end
		
		
		////////////////////////////////////////
		// You can add multiple versions too: //
		////////////////////////////////////////
		
		//# 1.12.2
		System.out.println("Only enabled in 1.12.2 and below");
		//# 1.8.9
//$$		System.out.println("Only enabled in 1.8.9 and below");
		//# end
		
		
		////////////////////////////////////////
		// Def is always the lowest version: //
		///////////////////////////////////////
		
		//# def
		System.out.println("Only enabled in 1.12.2 and below");
		//# 1.8.9
//$$		System.out.println("Only enabled in 1.8.9 and below");
		//# end
		
		
		////////////////////////////////////////
		// 		Ordering is arbitrary! 		 //
		///////////////////////////////////////
		
		//# 1.8.9
//$$		System.out.println("Only enabled in 1.8.9 and below");
		//# def
		System.out.println("Only enabled in 1.12.2 and below");
		//# end
	}

}
