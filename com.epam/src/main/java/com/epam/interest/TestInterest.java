package com.epam.interest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

 
public class TestInterest
{
    private static final Logger LOGGER = LogManager.getLogger(TestInterest.class);
    
     
    public static void main(String[] args) 
    {
        LOGGER.debug("Debug Message Logged !!!");
        LOGGER.info("Info Message Logged !!!");
       
			TestInterest c = new TestInterest();
			c.simpleInterest(10000, 3, 2);
			c.simpleInterest(15000, 1.5, 2.5);
			c.simpleInterest(100000, 1.5, 1.25);
			//TestInterest c = new TestInterest();
			c.compoundInterest(10090, 3, 2);
			c.compoundInterest(55000, 1.25, 1.5);
		    c.compoundInterest(100000, 1.5, 1.25);
		}
        

		public double simpleInterest(double principle, double time, double rateOfInterest) {
			return (principle*time*rateOfInterest) / 100.0;
		}
		
		public double compoundInterest(double principle, double time1, double rateOfInterest1) {
			return principle * Math.pow((1+rateOfInterest1)/100, time1);
		}
    }
	    


		
		

