import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int steps, aDays;
 private ArrayList <Integer> dSteps;
 
 public StepTracker(int s){
 steps = s;
 aDays = 0;
 dSteps = new ArrayList <Integer> ();
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
 double total = 0.0;
  if(dSteps.size() == 0){
   return 0.0;
  } else {
  for(int i = 0; i < dSteps.size(); i++)
   total+=dSteps.get(i);
return total/dSteps.size();
 }
 }
} 
