
/**
 * Write a description of TitleAndDepthComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class TitleAndDepthComparator implements Comparator<QuakeEntry> {
    
    public TitleAndDepthComparator(){
    }
    
    public int compare(QuakeEntry q1, QuakeEntry q2){
        String t1 = q1.getInfo();
        String t2 = q2.getInfo();
        //double d1 = q1.getDepth();
        //double d2 = q2.getDepth();
        int TitleComp = t1.compareTo(t2);
        if(TitleComp == 0){
            return Double.compare(q1.getDepth(), q2.getDepth());
        }
        return TitleComp;
    }

}
