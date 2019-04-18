package elements;

public class BuildPlan {

	private Item[] elements;
	 
    public BuildPlan() {
        //create new Array of elements
        this.elements = new Item[] { new Invocation( ), 
            new Invocation( ), new Invocation( ) , 
            new Invocation( ), new Body(), new Engine() };
    }
    
    public Item[] getElements() {
		return elements;
	}
}
