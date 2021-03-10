import java.util.*;
import org.json.*;
/*
This program is to implement the functional programming using lambda expression 

*/
interface showPrint{ //No return type of lambada with one paramenter 
	public void showit(String n);
}


interface addString { //String return with two parameters 
	public String adding(String s,String d);
}
public class lambda2 {
	public static void main(String[] args) {
		showPrint sp = s->{System.out.println("OUTPUT IS "+s);};
		sp.showit("Hello");
		returnString rS=s->printing(s);
		rS.myString("Yanni");
		//System.out.println(rS.myString("Vuyani"));
		//addString aS =(s,p)->s+p;
		//=System.out.println(aS.adding("Vuyani","Daweti"));
		mySettings session_settings = new mySettings();
		//Map<String,Boolean> toolset = session_settings.getSettings();

		//Change settings 
		//Map<String,Boolean> new_settings= new HashMap<String,Boolean>();
		System.out.println("_______________SETTINGS CONFIGURATION:__________________");
		//new_settings = ;
		for (Map.Entry m : session_settings.getSettings().entrySet()){
			System.out.println(m.getKey()+"-"+ m.getValue());
		}
		System.out.println("\nDo you want to change your settings? Y/N");
		char change_value = 'Y';
		Scanner myscan=new Scanner(System.in);
		String answer=myscan.nextLine();
		if (answer.equals("y")||answer.equals("Y")){
			ArrayList<String> tools= session_settings.getSettingsAsList();
			System.out.println(tools);
			callSettings mycurrentsetting=(s,b)->changeSettings(session_settings.getSettings(),s,b);
			for (String m:tools){
				System.out.println(m+":");
				Scanner scan=new Scanner(System.in);
				String answer1 =scan.nextLine();
				if (answer1.equals("t")||answer1.equals("T"))
				{
					mycurrentsetting.settings(m,true);
				}
				else{
					mycurrentsetting.settings(m,false);
				}
			}
		}
		System.out.println("___________________NEW SETTINGS ________________");
		for (Map.Entry m : session_settings.getSettings().entrySet()){
			System.out.println(m.getKey()+"-"+ m.getValue());
		}


	}
	public static void printing(String s){
		System.out.println("This is a called method to string"+s);
	}
	interface returnString{ //String type return with one parameter 
		public void myString(String s);
	}
	//Design a class that changes its values when the lambda 
	//expression is called using the values by user to  
	//let the called funtion change the values of the class
	interface callSettings{
		public void settings(String s ,boolean b);
	}

	public static void changeSettings (Map<String,Boolean> map,String s , boolean b){
		map.replace(s,b);
		System.out.println("Settings changed successfully..............["+s+":"+b+"]");
	}

}

class mySettings{
	boolean lights_off = false;
	boolean doors_closed = false;
	boolean music_on = false; 
	boolean low_gauge = false ;
	Map<String,Boolean> settings= new HashMap<String,Boolean>();
	public mySettings(){
		settings.put("lights_off",this.lights_off);
		settings.put("doors_closed",this.doors_closed);
		settings.put("music_on",this.music_on);
		settings.put("low-gauge",this.low_gauge);
	}
	//getters 
	public boolean getLights_Off(){
		return this.lights_off;
	}
	public boolean getDoors_closed(){
		return this.doors_closed;
	}
	public boolean getMusic_On(){
		return this.music_on;
	}
	public boolean getLow_Gauge(){
		return this.low_gauge;
	}
	public Map<String,Boolean> getSettings(){
		return settings;
	}
	//setters
	public void setLights_Off(boolean lights_off){
		this.lights_off =lights_off;
	}
	public void setDoors_Off(boolean doors_closed){
		this.doors_closed=doors_closed;
	}
	public void setMusic_On(boolean music_on){
		this.music_on=music_on;
	}
	public void setLow_Gauge(boolean low_gauge){
		this.low_gauge=low_gauge;
	}
	public void defaultSettings(){
		settings.clear();
		settings.put("lights_off",this.lights_off);
		settings.put("doors_closed",this.doors_closed);
		settings.put("music_on",this.music_on);
		settings.put("low-gauge",this.low_gauge);
	}
	public ArrayList<String> getSettingsAsList(){
		ArrayList<String> settingsList = new ArrayList<>(settings.size());
		for (Map.Entry m : this.settings.entrySet()){
			settingsList.add(m.getKey().toString());
			System.out.println(m.getKey() +":"+m.getValue());
		}
		return settingsList;
	}
	public void saveSettings(Map<String,Boolean> map){
		JSONObject obj = new JSONObject();
		for (Map m:map.entrySet()){
			obj.put(m.getKey(),m.getValue());
		}
		Files.write(Paths.get("settings.json"));
	}
}