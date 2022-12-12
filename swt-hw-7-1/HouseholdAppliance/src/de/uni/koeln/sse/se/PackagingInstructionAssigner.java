package de.uni.koeln.sse.se;

public class PackagingInstructionAssigner implements Visitor{

    private String tmpInstructions;

    @Override
    public void visitFurniture(Furniture furniture) {
        tmpInstructions = "should be covered with " +
                "waterproof covers with an area of the furniture";
    }

    @Override
    public void visitGlass(Glass glass) {
        tmpInstructions = "should be packed in a box with a dimension of 1 cm larger\n" +
                "dimensions of the item and filled with Bubble wraps.";

    }

    @Override
    public void visitElectronic(Electronic electronic) {
        tmpInstructions = "should be covered with Polyethylene foam film and packed in\n" +
                "a box with a dimension of 1 cm larger dimensions of the item.";
    }

    public String getInstructions(HouseholdItem householdItem){
        tmpInstructions = "";
        householdItem.accept(this);
        return tmpInstructions;
    }
}
