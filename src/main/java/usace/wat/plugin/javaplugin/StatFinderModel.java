package usace.wat.plugin.javaplugin;
import usace.wat.plugin.Input;
import usace.wat.plugin.Output;

public class StatFinderModel {
    @JsonProperty
    public String name;
    @JsonProperty
    public Input[] inputs;
    @JsonProperty
    public Output[] outputs;
}