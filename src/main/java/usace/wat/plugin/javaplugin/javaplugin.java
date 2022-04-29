package usace.wat.plugin.javaplugin;
public class javaplugin  {
    public static final String PluginName = "javaplugin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(PluginName + " says hello.");
        //check the args are greater than 1
        if(args.length!=1){
            System.out.println("Did not detect only one argument");
            return;
        }
        //first arg should be a modelpayload check to see it is
        //copy the path to local if not local
        //deseralize to objects
        //check that the plugin name is correct.
        //develop a stat finder model computable object.
        //compute passing in the event config portion of the model payload 
    }
}