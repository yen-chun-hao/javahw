class Cbox
{
    int length,width,height;
}
public class hw8_5
{
    public static void main(String arge[])
    {
        Cbox box;
        box=new Cbox();
        box.length=1;
        box.width=1;
        box.height=1;
        int volume,surfaceArea,showData,showall;
        volume=box.length*box.width*box.height;
        surfaceArea=box.length*box.width*6;
        System.out.println("volume= "+volume);
        System.out.println("surfaceArea= "+surfaceArea);
        System.out.println("showData= "+box.length+","+box.width+","+box.height);
        System.out.println("showall= "+box.length+","+box.width+","+box.height+","+volume+","+surfaceArea);
    }
}
