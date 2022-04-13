import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StatFinderModelComputable {
   public ModelLinks Linkages;
   public StatFinderModel Model;
   public StatFinderModelComputable(StatFinderModel model, ModelLinks linkages){
       Model = model;
       Linkages = linkages;
   }
   public void Compute(EventConfiguration config){
       for (LinkedInput li : Linkages.linked_inputs) {
           for (Output o : Linkages.required_outputs) {
               if (li.input.name.equals(o.name)){
                   //fetch the input
                   //where is the input?
                   String path = "/workspaces/config/" + li.input.name + ".csv";
                   //create a destination array
                   ArrayList<Double> flowlist = new ArrayList<Double>();
                   //read the file
                    try {
                        File input = new File(path);
                        Scanner myReader = new Scanner(input);
                        myReader.nextLine();//skip header.
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            String[] parts = data.split(",");
                            double flow = Double.parseDouble(parts[1]);
                            flowlist.add(flow);
                            System.out.println(flow);
                        }
                        myReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                   //compute the stat?
                   double stat = 0.0;
                   switch (o.parameter){
                       case "max"://compute max
                       stat = Double.MIN_VALUE;
                       for(Double d : flowlist){
                           if(d>stat) stat = d;
                       }
                       break;
                       default:
                       stat = Double.MIN_VALUE;
                       for(Double d : flowlist){
                           if(d>stat) stat = d;
                       }
                   }
                   //write output
               }
           }
       }
   }
}  
