public class MilkingMachine implements IMilkable {
    MilkTank milktank;
    String name;

    public MilkingMachine(String name) {
        this.name = name;
    }

    public void milk(IMilkable animal) {  //depends on IMilkable
        animal.milk();
    }

    public void setMilkTank(MilkTank milktank) {
        this.milktank = milktank;
    }

    @Override
    public double milk() {
        return 0.0;
    }
}
