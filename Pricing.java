import java.util.concurrent.ArrayBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.*;
/*import org.junit.jupiter.api.Test;

@Test*/ // for junit test



public class Pricing {

	private static Map<String, String> map; 
    static {
    	 setMap(new HashMap<>());  
    	}
    
public static void main(String args[]){
try{
	 
	System.out.println("Welcome to pricing engine");
	BlockingQueue<Double> queue = new ArrayBlockingQueue<>(100);
	// user config and default
	System.out.println("Enter the Y for user config Or default for N");
	@SuppressWarnings("resource")
	Scanner sin=new Scanner(System.in);
	String uan=sin.nextLine();
	if(uan.toLowerCase().equals("y")){
		Frame tread1=new Frame(getMap());
		Thread t1=new Thread(tread1);
		t1.start();
		t1.join();
		HandleWithBreak tread2=new HandleWithBreak(getMap());
		Thread t2=new Thread(tread2);
		t2.start();
		t2.join();
		Seating tread3=new Seating(getMap());
		Thread t3=new Thread(tread3);
		t3.start();
		t3.join();
		Wheels tread4=new Wheels(getMap());
		Thread t4=new Thread(tread4);
		t4.start();
		t4.join();
		ChainAssemble tread5=new ChainAssemble(getMap());
		Thread t5=new Thread(tread5);
		t5.start();
		t5.join();
		MonthOfBuying mob6 =new MonthOfBuying(getMap());
		Thread t6=new Thread(mob6);
		t6.start();
		t6.join();
		
		SetDefault sd =new SetDefault(getMap());
		Thread t7=new Thread(sd);
		t7.start();
		t7.join();
		PriceUnit pu =new PriceUnit(queue,getMap());
		Thread t8=new Thread(pu);
		t8.start();
		t8.join();
		MaxWithGstAndCoupon msc =new MaxWithGstAndCoupon(queue,getMap());
		Thread t9=new Thread(msc);
		t9.start();
		System.out.println(queue);
		
	}
	else if(uan.toLowerCase().equals("n")){
		SetDefault sd =new SetDefault(getMap());
		Thread t7=new Thread(sd);
		t7.start();
		t7.join();
		PriceUnit pu =new PriceUnit(queue,getMap());
		Thread t8=new Thread(pu);
		t8.start();
		t8.join();
		MaxWithGstAndCoupon msc =new MaxWithGstAndCoupon(queue,getMap());
		Thread t9=new Thread(msc);
		t9.start();
		System.out.println(queue);
	}
	else{
		System.out.println("Invalid input");
	}
		
	}
catch(Exception e){
e.printStackTrace();
}
}

public static Map<String, String> getMap() {
	return map;
}

public static void setMap(Map<String, String> map) {
	Pricing.map = map;
}
}

//customized frame config
class Frame extends Pricing implements Runnable{
	
public Frame(Map<String, String> map) {
		
	}

@SuppressWarnings("resource")
@Override
    public void run() {
        try{
        	
        	System.out.println("Enter the Number for customized frame config \n1)Color\n2)Shape\n3)Materials");
        	Scanner scan=new Scanner(System.in);
        	int num=scan.nextInt();
        	if(num==1) {
        		String color=null;
        		System.out.println("Enter the number for customized color of frame  \n1)Black\n2)Red\n3)White\n4)Metal Blue");
        		Scanner scan1=new Scanner(System.in);
        		int num1=scan1.nextInt();
        		if(num1==1) color="black";
        		else if(num1==2) color="red";
        		else if(num1==3) color="white";
        		else if(num1==4) color="metalblue";
        		else System.out.println("Invaild Input");
        		getMap().put("framecolor",color);
        		System.out.println("Do you want to continue in frame sub menu enter Y for yes or N for no ");
        		Scanner sin2=new Scanner(System.in);
        		String uan2=sin2.nextLine();
        		if(uan2.toLowerCase().equals("y")){
        			run();
        		}
        		else {
        			
        		}
        	}
        	else if(num==2) {
        		String shape=null;
        		System.out.println("Enter the number for customized shape of frame \n1)Diamond\n2)Cantilever\n3)Monocoque\n4)Folding");
        		Scanner scan1=new Scanner(System.in);
        		int num1=scan1.nextInt();
        		if(num1==1) shape="diamond";
        		else if(num1==2) shape="cantilever";
        		else if(num1==3) shape="monocoque";
        		else if(num1==4) shape="folding";
        		else System.out.println("Invaild Input");
        		getMap().put("frameshape",shape);
        		System.out.println("Do you want to continue in frame sub menu enter Y for yes or N for no");
        		Scanner sin2=new Scanner(System.in);
        		String uan2=sin2.nextLine();
        		if(uan2.toLowerCase().equals("y")){
        			run();
        		}
        		else {
        				
        		}
        	}
        	else if(num==3) {
        		String mat=null;
        		System.out.println("Enter the number for customized materials frame  \n1)Steel\n2)Aluminum alloys\n3)Titanium\n4)Carbon fiber");
        		Scanner scan1=new Scanner(System.in);
        		int num1=scan1.nextInt();
        		if(num1==1) mat="steel";
        		else if(num1==2) mat="aluminumalloys";
        		else if(num1==3) mat="titanium";
        		else if(num1==4) mat="carbonfiber";
        		else System.out.println("Invaild Input");
        		getMap().put("framematerials",mat);
        		System.out.println("Do you want to continue in frame sub menu enter Y for yes or N for no ");
        		Scanner sin2=new Scanner(System.in);
        		String uan2=sin2.nextLine();
        		if(uan2.toLowerCase().equals("y")){
        			run();
        		}
        		else {
        				
        		}
        	}
        	else {
        		System.out.println("Invaild Input");
        	}
        	
}
catch(Exception e){
e.printStackTrace();
}
}

}

//customized Handlebar with breakes config
class HandleWithBreak extends Pricing implements Runnable{

public HandleWithBreak(Map<String, String> map) {
		
	}

@SuppressWarnings("resource")
@Override
    public void run() {
	try {
		System.out.println("Enter the number for customized Handlebar with breakes config \n1)Brake\n2)Handle Bar");
    	Scanner scan=new Scanner(System.in);
    	int num=scan.nextInt();
    	if(num==1) {
    		String brakes=null;
    		System.out.println("Enter the number for customized breake type  \n1)Spoon brakes\n2)Duck brakes \n3)Rim brakes \n4)Disc brakes");
    		Scanner scan1=new Scanner(System.in);
    		int num1=scan1.nextInt();
    		if(num1==1) brakes="spoonbrakes";
    		else if(num1==2) brakes="duckbrakes";
    		else if(num1==3) brakes="rimbrakes";
    		else if(num1==4) brakes="discbrakes";
    		else System.out.println("Invaild Input");
    		getMap().put("brakestype",brakes);
    		System.out.println("Do you want to continue in handlebar sub menu enter Y for yes or N for no");
    		Scanner sin2=new Scanner(System.in);
    		String uan2=sin2.nextLine();
    		if(uan2.toLowerCase().equals("y")){
    			run();
    		}
    		else {
    			
    		}
    	}
    	else if(num==2) {
    		String handletype=null;
    		System.out.println("Enter the number for customized Handle type \n1)Drop\n2)Standard\n3)Track\n4)Flat");
    		Scanner scan1=new Scanner(System.in);
    		int num1=scan1.nextInt();
    		if(num1==1) handletype="drop";
    		else if(num1==2) handletype="standard";
    		else if(num1==3) handletype="track";
    		else if(num1==4) handletype="flat";
    		else System.out.println("Invaild Input");
    		getMap().put("handletype",handletype);
    		System.out.println("Do you want to continue in handlebar sub menu enter Y for yes or N for no");
    		Scanner sin2=new Scanner(System.in);
    		String uan2=sin2.nextLine();
    		if(uan2.toLowerCase().equals("y")){
    			run();
    		}
    		else {
    			
    		}
    	}
    	else {
    		System.out.println("Invaild Input");
    		
    	}
	}
       
catch(Exception e){
e.printStackTrace();
}
}

}
// customized seating config 
class Seating extends Pricing implements Runnable{
	
	public Seating(Map<String, String> map) {
		
	}

	@SuppressWarnings("resource")
	@Override
	public void run() {
		
		 try{

	        	System.out.println("Enter the number for customized seating config \n1)Seats\n2)Saddle Materials");
	        	Scanner scan=new Scanner(System.in);
	        	int num=scan.nextInt();
	        	if(num==1) {
	        		String seattype=null;
	        		System.out.println("Enter the number for customized Seat type   \n1)Racing Saddles\n2)Comfort Saddles \n3)Mountain Bike Saddle \n4)Gel Saddle");
	        		Scanner scan1=new Scanner(System.in);
	        		int num1=scan1.nextInt();
	        		if(num1==1) seattype="racingsaddles";
	        		else if(num1==2) seattype="comfortsaddles";
	        		else if(num1==3) seattype="mountainbikesaddle";
	        		else if(num1==4) seattype="gelsaddle";
	        		else System.out.println("Invaild Input");
	        		getMap().put("seattype",seattype);
	        		System.out.println("Do you want to continue in seating sub menu enter Y for yes or N for no");
	        		Scanner sin2=new Scanner(System.in);
	        		String uan2=sin2.nextLine();
	        		if(uan2.toLowerCase().equals("y")){
	        			run();
	        		}
	        		else {
	        			//queue.put(getMap());
	        		}
	        	}
	        	else if(num==2) {
	        		String seatmat=null;
	        		System.out.println("Enter the Number for customized Saddle Materials \n1)Synthetic\n2)Leather\n3)Cotton");
	        		Scanner scan1=new Scanner(System.in);
	        		int num1=scan1.nextInt();
	        		if(num1==1) seatmat="synthetic";
	        		else if(num1==2) seatmat="leather";
	        		else if(num1==3) seatmat="cotton";
	        		else System.out.println("Invaild Input");
	        		getMap().put("seatmaterials",seatmat);
	        		System.out.println("Do you want to continue in seating sub menu enter Y for yes or N for no");
	        		Scanner sin2=new Scanner(System.in);
	        		String uan2=sin2.nextLine();
	        		if(uan2.toLowerCase().equals("y")){
	        			run();
	        		}
	        		else {
	        			//queue.put(getMap());	
	        		}
	        	}
	        	else {
	        		System.out.println("Invaild Input");
	  
	        	}
	}
		
		catch(Exception e){
			e.printStackTrace();
			}
		
	}
	
}

//customized wheels config
class Wheels extends Pricing implements Runnable{

	
	public Wheels(Map<String, String> map) {
		
	}

	@SuppressWarnings("resource")
	@Override
	public void run() {
		
		 try{

	        	System.out.println("Enter the number for customized wheels config \n1)Spokes\n2)Rim \n3)Materials\n4)Tyre\n5)no.of.gears");
	        	Scanner scan=new Scanner(System.in);
	        	int num=scan.nextInt();
	        	if(num==1) {
	        		String spokestype=null;
	        		System.out.println("Enter the number for customized spokes type   \n1)Straight-gauge spokes\n2)Single-butted spokes\n3)Double-butted spokes\n4)Aero bladed spokes\n5)Straight-pull spokes");
	        		Scanner scan1=new Scanner(System.in);
	        		int num1=scan1.nextInt();
	        		if(num1==1) spokestype="straight_gaugespokes";
	        		else if(num1==2) spokestype="single_buttedspokes";
	        		else if(num1==3) spokestype="double_buttedspokes";
	        		else if(num1==4) spokestype="aerobladedspokes";
	        		else if(num1==5) spokestype="straight_pullspokes";
	        		else System.out.println("Invaild Input");
	        		getMap().put("spokestype",spokestype);
	        		System.out.println("Do you want to continue in wheels sub menu enter Y for yes or N for no");
	        		Scanner sin2=new Scanner(System.in);
	        		String uan2=sin2.nextLine();
	        		if(uan2.toLowerCase().equals("y")){
	        			run();
	        		}
	        		else {
	        			
	        		}
	        	}
	        	else if(num==2) {
	        		String rimtype=null;
	        		System.out.println("Enter the Number for customized Rim type \n1)Tubular \n2)clincher \n3)aero");
	        		Scanner scan1=new Scanner(System.in);
	        		int num1=scan1.nextInt();
	        		if(num1==1) rimtype="tubular ";
	        		else if(num1==2) rimtype="clincher ";
	        		else if(num1==3) rimtype="aero";
	        		else System.out.println("Invaild Input");
	        		getMap().put("rimtype",rimtype);
	        		System.out.println("Do you want to continue in wheels sub menu enter Y for yes or N for no");
	        		Scanner sin2=new Scanner(System.in);
	        		String uan2=sin2.nextLine();
	        		if(uan2.toLowerCase().equals("y")){
	        			run();
	        		}
	        	}
	        	else if(num==3) {
	        		String mat=null;
	        		System.out.println("Enter the Number for customized materials for rim  \n1)Steel\n2)Aluminum alloys\n3)Titanium\n4)Carbon fiber");
	        		Scanner scan1=new Scanner(System.in);
	        		int num1=scan1.nextInt();
	        		if(num1==1) mat="steel";
	        		else if(num1==2) mat="aluminumalloys";
	        		else if(num1==3) mat="titanium";
	        		else if(num1==4) mat="carbonfiber";
	        		else System.out.println("Invaild Input");
	        		getMap().put("rimmaterials",mat);
	        		System.out.println("Do you want to continue in wheels sub menu enter Y for yes or N for no");
	        		Scanner sin2=new Scanner(System.in);
	        		String uan2=sin2.nextLine();
	        		if(uan2.toLowerCase().equals("y")){
	        			run();
	        		}
	        		else {
	        			
	        		}
	        	}
	        	else if(num==4) {
	        		String tyre=null;
	        		System.out.println("Enter the number for customized type for tyre  \n1)Tubeless\n2) with tube");
	        		Scanner scan1=new Scanner(System.in);
	        		int num1=scan1.nextInt();
	        		if(num1==1) tyre="tubeless";
	        		else if(num1==2) tyre="with_tube";
	     
	        		else System.out.println("Invaild Input");
	        		getMap().put("tyre",tyre);
	        		System.out.println("Do you want to continue in wheels sub menu enter Y for yes or N for no");
	        		Scanner sin2=new Scanner(System.in);
	        		String uan2=sin2.nextLine();
	        		if(uan2.toLowerCase().equals("y")){
	        			run();
	        		}
	        		else {
	        				
	        		}
	        	}
	        	else if(num==5) {
	        		String gears=null;
	        		System.out.println("Enter the number for customized gears for rim  \n1)2 Gears\n2)3 Gears\n3)4 Gears");
	        		Scanner scan1=new Scanner(System.in);
	        		int num1=scan1.nextInt();
	        		if(num1==1) gears="2gears";
	        		else if(num1==2) gears="3gears";
	        		else if(num1==3) gears="4gears";
	        		else System.out.println("Invaild Input");
	        		getMap().put("gears",gears);
	        		System.out.println("Do you want to continue in wheels sub menu enter Y for yes or N for no");
	        		Scanner sin2=new Scanner(System.in);
	        		String uan2=sin2.nextLine();
	        		if(uan2.toLowerCase().equals("y")){
	        			run();
	        		}
	        		else {
	        			
	        		}
	        	}

	        	else {
	        		System.out.println("Invaild Input");
	        		
	        	}
	}
		
		catch(Exception e){
			e.printStackTrace();
			}
		
	}
	
}
//customized chain type
class ChainAssemble extends Pricing implements Runnable{


	public ChainAssemble(Map<String, String> map) {
		
	}

	@SuppressWarnings("resource")
	@Override
	public void run() {
		
		 try{
	        		String chaintype=null;
	        		System.out.println("Enter the number for customized chain type   \n1)One-speed chains\n2)Derailleur chains");
	        		Scanner scan1=new Scanner(System.in);
	        		int num1=scan1.nextInt();
	        		if(num1==1) chaintype="one_speedchains";
	        		else if(num1==2) chaintype="derailleurchains";
	        		else System.out.println("Invaild Input");
	        		getMap().put("chaintype",chaintype);
	        		
		 }
		catch(Exception e){
			e.printStackTrace();
			}
		
	}
}

// get buying month
class MonthOfBuying extends Pricing implements Runnable{
	public MonthOfBuying(Map<String, String> map) {
		
	}

	@SuppressWarnings("resource")
	@Override
	public void run() {
	
		try {
			String month=null;
    		System.out.println("Enter the month of buying(format=january)");
    		Scanner scan1=new Scanner(System.in);
    		month=scan1.nextLine();
    		if(month.toLowerCase().equals("january")||month.toLowerCase().equals("february")
    				||month.toLowerCase().equals("march")||month.toLowerCase().equals("april")
    				||month.toLowerCase().equals("may")||month.toLowerCase().equals("june")
    				||month.toLowerCase().equals("july")||month.toLowerCase().equals("august")
    				||month.toLowerCase().equals("september")||month.toLowerCase().equals("october")
    				||month.toLowerCase().equals("november")||month.toLowerCase().equals("decemeber"))
    			getMap().put("month",month);
    		else {
    			System.out.println("invalid month");
    			run();
    		}
		}
		catch(Exception e){
			e.printStackTrace();
			}
	}

}

// default setup
class SetDefault extends Pricing implements Runnable{
	public SetDefault(Map<String, String> map) {
		
	}

	@Override
	public void run() {
		try {
			if(!getMap().containsKey("framecolor"))getMap().put("framecolor","red");
			 if(!getMap().containsKey("frameshape"))getMap().put("frameshape","diamond");
			 if(!getMap().containsKey("framematerials"))getMap().put("framematerials","steel");
			 if(!getMap().containsKey("brakestype"))getMap().put("brakestype","discbrakes");
			 if(!getMap().containsKey("handletype"))getMap().put("handletype","standard");
			 if(!getMap().containsKey("seattype"))getMap().put("seattype","racingsaddles");
			 if(!getMap().containsKey("seatmaterials"))getMap().put("seatmaterials","synthetic");
			 if(!getMap().containsKey("spokestype"))getMap().put("spokestype","straight_gaugespokes");
			 if(!getMap().containsKey("rimtype"))getMap().put("rimtype","tubular");
			 if(!getMap().containsKey("rimmaterials"))getMap().put("rimmaterials","steel");
			 if(!getMap().containsKey("tyre"))getMap().put("tyre","tubeless");
			 if(!getMap().containsKey("gears"))getMap().put("gears","3gears");
			 if(!getMap().containsKey("chaintype"))getMap().put("chaintype","derailleurchains");
			 if(!getMap().containsKey("month"))getMap().put("month","june");
			
		}
		catch(Exception e){
			e.printStackTrace();
			}
		
	}
}

// calculate price 
class PriceUnit extends Pricing implements Runnable{
	private BlockingQueue<Double> queue;
	
	public PriceUnit(BlockingQueue<Double> queue, Map<String, String> map) {
		
		this.queue=queue;
	}
    

	 int black=100,white=95,diamond=100,monocoque=95,steel=2000,titanium=3000,spoonbrakes=200,
			 rimbrakes=240,drop=500,track=400,racingsaddles=300,mountainbikesaddle=350,synthetic=20,
			 leather=30,straight_gaugespokes=230,straight_pullspokes=250,tubular=600,aero=550,
			 tubeless=550,with_tube=400,tgears=700,thgears=900,derailleurchains=400;
	 double red=110.50,metalblue=105.50,cantilever=100,folding=150.50,aluminumalloys=2500,carbonfiber=2700,
			 duckbrakes=210.20,discbrakes=500,standard=350,flat=400,comfortsaddles=35,gelsaddle=28,
			 cotton=50,single_buttedspokes=180,double_buttedspokes=456,aerobladedspokes=342,
			 clincher=400,fgears=1000,one_speedchains=350;

	 double frame_price=0,handle_with_break=0,seating=0,wheels=0,chainassemble=0,otherandservice=1500;
	
	@Override
	public void run() {
		
		 try {
			String month=getMap().get("month");
			if(month.equals("january")||month.equals("decemeber")||month.equals("march")) {
				steel=1900;titanium=2900;aluminumalloys=2400;carbonfiber=2600;tgears=650;thgears=850;fgears=950;
			}
			else if(month.equals("september")) {
				steel=2100;titanium=3100;aluminumalloys=2600;carbonfiber=2800;tgears=750;thgears=950;fgears=1050;
			}
			if(getMap().get("framecolor").equals("black"))frame_price=black;
			else if(getMap().get("framecolor").equals("white"))frame_price=white;
			else if(getMap().get("framecolor").equals("red"))frame_price=red;
			else if(getMap().get("framecolor").equals("metalblue"))frame_price=metalblue;
			
			if(getMap().get("frameshape").equals("diamond"))frame_price=frame_price+diamond;
			else if(getMap().get("frameshape").equals("cantilever"))frame_price=frame_price+cantilever;
			else if(getMap().get("frameshape").equals("monocoque"))frame_price=frame_price+monocoque;
			else if(getMap().get("frameshape").equals("folding"))frame_price=frame_price+folding;
			

			if(getMap().get("framematerials").equals("steel"))frame_price=frame_price+steel;
			else if(getMap().get("framematerials").equals("aluminumalloys"))frame_price=frame_price+aluminumalloys;
			else if(getMap().get("framematerials").equals("titanium"))frame_price=frame_price+titanium;
			else if(getMap().get("framematerials").equals("carbonfiber"))frame_price=frame_price+carbonfiber;
			
			queue.put(frame_price);
			if(getMap().get("brakestype").equals("spoonbrakes"))handle_with_break=spoonbrakes;
			else if(getMap().get("brakestype").equals("duckbrakes"))handle_with_break=duckbrakes;
			else if(getMap().get("brakestype").equals("rimbrakes"))handle_with_break=rimbrakes;
			else if(getMap().get("brakestype").equals("discbrakes"))handle_with_break=discbrakes;
			
			if(getMap().get("handletype").equals("drop"))handle_with_break=frame_price+drop;
			else if(getMap().get("handletype").equals("standard"))handle_with_break=frame_price+standard;
			else if(getMap().get("handletype").equals("track"))handle_with_break=frame_price+track;
			else if(getMap().get("handletype").equals("flat"))handle_with_break=frame_price+flat;
			
			queue.put(handle_with_break);
			
			if(getMap().get("seattype").equals("racingsaddles"))seating=racingsaddles;
			else if(getMap().get("seattype").equals("comfortsaddles"))seating=comfortsaddles;
			else if(getMap().get("seattype").equals("mountainbikesaddle"))seating=mountainbikesaddle;
			else if(getMap().get("seattype").equals("gelsaddle"))seating=gelsaddle;
			
			if(getMap().get("seatmaterials").equals("synthetic"))seating=frame_price+synthetic;
			else if(getMap().get("seatmaterials").equals("leather"))seating=frame_price+leather;
			else if(getMap().get("seatmaterials").equals("cotton"))seating=frame_price+cotton;
	
			queue.put(seating);
			
			if(getMap().get("spokestype").equals("straight_gaugespokes"))wheels=straight_gaugespokes;
			else if(getMap().get("spokestype").equals("single_buttedspokes"))wheels=single_buttedspokes;
			else if(getMap().get("spokestype").equals("double_buttedspokes"))wheels=double_buttedspokes;
			else if(getMap().get("spokestype").equals("aerobladedspokes"))wheels=aerobladedspokes;
			else if(getMap().get("spokestype").equals("straight_pullspokes"))wheels=straight_pullspokes;
			
			if(getMap().get("rimtype").equals("tubular"))wheels=wheels+tubular;
			else if(getMap().get("rimtype").equals("clincher"))wheels=wheels+clincher;
			else if(getMap().get("rimtype").equals("aero"))wheels=wheels+aero;
			

			if(getMap().get("rimmaterials").equals("steel"))wheels=wheels+steel;
			else if(getMap().get("rimmaterials").equals("aluminumalloys"))wheels=wheels+aluminumalloys;
			else if(getMap().get("rimmaterials").equals("titanium"))wheels=wheels+titanium;
			else if(getMap().get("rimmaterials").equals("carbonfiber"))wheels=wheels+carbonfiber;
			
			if(getMap().get("tyre").equals("diamond"))wheels=wheels+tubeless;
			else if(getMap().get("tyre").equals("cantilever"))wheels=wheels+with_tube;
			

			if(getMap().get("gears").equals("2gears"))wheels=wheels+tgears;
			else if(getMap().get("gears").equals("3gears"))wheels=wheels+thgears;
			else if(getMap().get("gears").equals("4gears"))wheels=wheels+fgears;
			
			queue.put(wheels);
			
			if(getMap().get("chaintype").equals("one_speedchains"))chainassemble=one_speedchains;
			else if(getMap().get("chaintype").equals("derailleurchains"))chainassemble=derailleurchains;
			
			queue.put(chainassemble);
			queue.put(otherandservice);
			System.out.println("Frame price of selected item is ("+getMap().get("framecolor")+","+getMap().get("frameshape")+","+getMap().get("framematerials")+") ="+frame_price);
			System.out.println("Handle with break of selected item is ("+getMap().get("brakestype")+","+getMap().get("handletype")+") ="+handle_with_break);
			System.out.println("Seating price  selected item is ("+getMap().get("seattype")+","+getMap().get("seatmaterials")+") ="+seating);
			System.out.println("Wheels price of selected item is ("+getMap().get("spokestype")+","+getMap().get("rimtype")+","+getMap().get("rimmaterials")+","+getMap().get("tyre")+","+getMap().get("gears")+") ="+wheels);
			System.out.println("Chain assembly of selected item is ("+getMap().get("chaintype")+") ="+chainassemble);
			System.out.println("Other parts and service charge"+otherandservice);
			 
		 }
		catch(Exception e){
			e.printStackTrace();
			}
		
	}
}

//calculate price with coupon code
class MaxWithGstAndCoupon  extends Pricing implements Runnable{
	private BlockingQueue<Double> queue;
	
	public MaxWithGstAndCoupon(BlockingQueue<Double> queue, Map<String, String> map) {
		
		this.queue=queue;
	}

	@SuppressWarnings("resource")
	@Override
	public void run() {
	
		double total=0, fort=0;;
		try {
			String coupon=null;
			
			Iterator<Double> it = queue.iterator();
		    while(it.hasNext()){
		    	total=total+it.next();
		    }
		    System.out.println("---------------------------------------------------------------");
		    System.out.println("Total cost per cycle ="+total);
		    System.out.println("---------------------------------------------------------------");
		    fort=(total*1000*10/100);
		    System.out.println("Total cost for 1000 cycle ="+total*1000);
		    System.out.println("---------------------------------------------------------------");
		    System.out.println("D6 you have refer code(enter 91social for applying coupon and get 10%) otherwise N for no");
	
		    Scanner scan1=new Scanner(System.in);
		    coupon=scan1.nextLine();
		if(coupon.toUpperCase().equals("91SOCIAL")) {
			
			System.out.println("Applyig coupon code for cost 1000 cycle ="+((total*1000)-fort));
			
		}
		else {
			 System.out.println("Total cost for 1000 cycle witout applying coupon code ="+(total*1000));
		}
		
		}
		catch(Exception e){
			e.printStackTrace();
			}
		
	}
}