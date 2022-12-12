package de.uni.koeln.sse.se;

public class PriceCalculator implements Visitor{
    private double tmpPrice;

    @Override
    public void visitElectronic(Electronic electronic) {
        if (electronic.getFragile()){
            tmpPrice = electronic.getWeight() * 0.5;
        }
        else{
            tmpPrice = electronic.getWeight() * (1.0/3.0);
        }
    }

    @Override
    public void visitFurniture(Furniture furniture) {
        tmpPrice = furniture.getWeight() * 0.25;
    }

    @Override
    public void visitGlass(Glass glass) {
        tmpPrice = 0;
        if (glass.getTickness() == 1){
            tmpPrice = glass.getLenght() * 2.0;
        }
        else if(glass.getTickness() == 2){
            tmpPrice = glass.getLenght() * 1.2;
        }
        else if(glass.getTickness() == 3){
            tmpPrice = glass.getLenght() * 0.7;
        }
    }

    public double getPrice(HouseholdItem householdItem){
        tmpPrice = 0;
        householdItem.accept(this);
        return tmpPrice;
    }
}
