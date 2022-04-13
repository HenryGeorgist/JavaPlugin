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
                   //read the file

                   //compute the stat?
                   switch (o.parameter){
                       case "max":
                       break;
                       default:
                       //compute max
                   }
               }
           }
       }
   }
}  
