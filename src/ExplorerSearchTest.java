import static org.junit.Assert.*;
import org.junit.Test;

public class ExplorerSearchTest {
    @Test
    public void testReachableArea_someUnreachable() {
        int[][] island = {
            {1,1,1,3,1,1},
            {3,2,3,1,3,1},
            {1,1,1,1,3,3},
            {3,1,2,1,0,1},
            {1,1,1,2,1,1},
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(14, actual);
    }

    // Add more tests here!
    // Come up with varied cases
    //0: start   1: walkable land,  2: no water 3: mountain


    @Test
    public void testReachableArea_allReachable(){
        int[][] island ={
            {0, 1, 1},
            {1, 1, 1},
            {1, 1, 1},
        };
        int result = ExplorerSearch.reachableArea(island);
        assertEquals(9, result);
    }

    @Test
    public void testReachableArea_onlyStart(){
        int[][] island ={
            {0}
        };
        int result = ExplorerSearch.reachableArea(island);
        assertEquals(1, result);
    }

    @Test
    public void testReachableArea_blockedByWater(){
        int[][] island={
            {0, 2, 1},
            {2, 2, 2},
            {1, 2, 1}
        };
        int result = ExplorerSearch.reachableArea(island);
        assertEquals(1, result);
    }

     @Test
    public void testReachableArea_blockedByMountain(){
        int[][] island={
            {0, 3, 1},
            {3, 3, 3},
            {1, 3, 1}
        };
        int result = ExplorerSearch.reachableArea(island);
        assertEquals(1, result);
    }

    @Test
    public void testReachableArea_blochedCorner(){
        int[][] island={
            {0, 2},
            {2, 2}
        } ;
        int result = ExplorerSearch.reachableArea(island);
        assertEquals(1, result); 
     }

     @Test
     public void testReachableArea_mixedBarriers(){

        int[][] island ={
            {2, 2, 3},
            {3, 0, 2},
            {2, 2, 3}
        };
        int result = ExplorerSearch.reachableArea(island);
        assertEquals(1,  result);
     }

   @Test
public void testReachableArea_surroundedByWaterAndMountains() {
    int[][] island = {
        {3, 3, 3, 3, 3},
        {3, 0, 1, 1, 3},
        {3, 1, 2, 1, 3},
        {3, 1, 1, 1, 3},
        {3, 3, 3, 3, 3}
    };
    int result = ExplorerSearch.reachableArea(island);
    assertEquals(8, result);
}


}
