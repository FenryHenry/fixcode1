import java.util.ArrayList;
import java.util.TreeSet;

public class GhostTest
{
    class Point
    {
        private Integer x;
        private Integer y;
        
        public Point(Integer inX, Integer inY)
        {
            x = inX;
            y = inY;
        }
        
        public Integer getX()
        {
            return x;
        }
        
        public Integer getY()
        {
            return y;
        }
        
        public boolean equals(Point p)
        {
            return x.equals(p.getX()) && p.getY().equals(y);
        }
    }

    public GhostTest()
    {
    }

    public static void main(String[] args)
    {
        ArrayList<String> keys = new ArrayList<>();
        keys.add("ghost");
        keys.add("alien");
        keys.add("alien");
        keys.add("spiderman");
        keys.add("adiabatman");
        keys.add("scaryInversion");
        
        Integer[] values = {
                new Integer(1),
                new Integer(2),
                new Integer(100)
        };
        
        // How to fix this error?
        //
        //ArrayList<Integer> scaryKeys = (ArrayList<Integer>) Arrays.asList(values);
        
        keys.forEach(k -> System.out.println(k));
        
        keys.removeIf(k -> k.equalsIgnoreCase("alien"));
        
        GhostTest gt = new GhostTest();
        GhostTest.Point p1 = gt.new Point(1,1);
        GhostTest.Point p2 = gt.new Point(new Integer(1), new Integer(1));
        
        if (p1.equals(p2))
            System.out.println("wow");
        else
        {
            System.out.println("aha");
        }
        TreeSet<GhostTest.Point> tp = new TreeSet<>();

        ArrayList<GhostTest.Point> points = new ArrayList<>();
        for (int index = 0; index < 5; ++index)
        {
            points.add(p1);
            // How to fix this?
            //tp.add(p1);
        }
        
        points.forEach(p -> System.out.println(p.getX()));
               
        // How to fix this?
        // tp.addAll(points);
        tp.forEach(p -> System.out.println(p.getX()));

        
        

    }

}
