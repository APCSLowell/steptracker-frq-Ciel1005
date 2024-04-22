import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int steps, aDays;
 private ArrayList <Double> dSteps;
 
 public StepTracker(int s){
 steps = s;
 aDays = 0;
 dSteps = new ArrayList <Double> ();
}
 public int activeDays(){
  for(int i = 0; i < dSteps.size();i++)
   if(dSteps.get(i) >= steps)
    aDays++;
  return aDays;
 }

 public void addDailySteps(int daily){
 dSteps.add(daily);
 }
 public double averageSteps(){
 double total = 0;
  for(int i = 0; i < dSteps.size(); i++)
   total+=dSteps.get(i);
return total/dSteps.size();
 }
} 
