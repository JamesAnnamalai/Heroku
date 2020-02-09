package com.heroku.pages;

import com.heroku.project.api.base.ProjectSpecificScript;

//import herokuapp.pages.Dropdownpage;
//import herokuapp.pages.DynamicLoadingPage;
//import herokuapp.pages.EntryAdPage;

public class HomePage extends ProjectSpecificScript{
	
		
		public DynamicLoadPage clickDynamic()
		{
			click(locateElement("link","Dynamic Loading"));
			return new DynamicLoadPage();
		}
		
		public DropdownPage clickDropdown() {
			click(locateElement("link","Dropdown"));
			return new DropdownPage();
		}
		
		public BrokenImagePage clickBrokenImage() {
			click(locateElement("link", "Broken Images"));
			return new BrokenImagePage();
		}
	}

