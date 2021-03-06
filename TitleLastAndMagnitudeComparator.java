
/**
 * Write a description of TitleLastAndMagnitudeComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class TitleLastAndMagnitudeComparator implements Comparator<QuakeEntry>{
    public TitleLastAndMagnitudeComparator(){
    }
    
    public int compare(QuakeEntry q1, QuakeEntry q2){
        String tl1 = q1.getInfo().substring(q1.getInfo().lastIndexOf(" ")+1);
        String tl2 = q2.getInfo().substring(q2.getInfo().lastIndexOf(" ")+1);

        int TitleComp = tl1.compareTo(tl2);
        if(TitleComp == 0){
            return Double.compare(q1.getMagnitude(), q2.getMagnitude());
        }
        return TitleComp;
    }

}
