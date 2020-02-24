package com.epam;

		 
		import org.apache.logging.log4j.LogManager;
		import org.apache.logging.log4j.Logger;
		 
		public class CalculateCost
		{
		    private static final Logger LOGGER = LogManager.getLogger(CalculateCost.class);
		    
		     
		    public static void main(String[] args) 
		    {
		        LOGGER.debug("Debug Message Logged !!!");
		        LOGGER.info("Info Message Logged !!!");
		        
					CalculateCost cc = new CalculateCost();
					cc.getCost("standard",6,false);
					cc.getCost("highStandard",3,true);
					cc.getCost("aboveStandard",2,true);
				    cc.getCost("highStandard",5,false);
		    }
			private double getCost(String materialStandard, double area , boolean automated) {
				double cost = 0.0;
				if(materialStandard.equals("standard"))
					cost= 1200*area;
				else if(materialStandard.equals("aboveStandard"))
					cost = 1500*area;
				else if(materialStandard.equals("highStandard") && automated == true)
					cost = 2500*area;
				else if(materialStandard.equals("highStandard"))
					cost = 1800*area;
				return cost;
			}
			
		}
			
		


