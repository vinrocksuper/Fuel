import java.util.List;

public class FuelDepot {
    private FuelRobot filler;
    private List<FuelTank> tanks;

    public int nextTankToFill(int threshold)
    {
        int min = threshold;
        int pos =0;
        int temp =0;
        boolean found =false;
        for(FuelTank f : tanks)
        {
            if(f.getFuelLevel()<=min)
            {
                min = f.getFuelLevel();
                pos = temp;
                found = true;
            }
            temp++;
        }
        if(found){
            return pos;
        }
        return filler.getCurrentIndex();
    }
    public void moveToLocation(int locIndex)
    {
        if(locIndex > filler.getCurrentIndex() && !filler.isFacingRight())
        {
            filler.changeDirection();
        }
        if(locIndex < filler.getCurrentIndex() && filler.isFacingRight())
        {
            filler.changeDirection();
        }
        while(filler.getCurrentIndex() != locIndex)
        {
            filler.moveForward(1);
        }
    }
}
