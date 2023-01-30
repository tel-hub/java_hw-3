public class Main {
    public static void main(String[] args) {
        double wallWidth1 = 10;
        double wallHeight1 = 2.2;

        double wallWidth2 = 5;
        double wallHeight2 = 2.2;

        double area1 = wallWidth1 * wallHeight1;
        double area2 = wallWidth2 * wallHeight2;

        double totalArea = (area1 + area2) * 2;

        System.out.println("Площадь стен комнаты = " + totalArea + "м2");


        double doorHeight = 2;
        double doorWidth = .9;

        double windowHeight = 1.2;
        double windowWidth = 1.9;

        double doorArea = doorHeight * doorWidth;
        double windowArea = windowHeight * windowWidth;

        System.out.println("Площадь двери = " + doorArea + "м2, площадь окна = " + windowArea + "м2");

        double wallpaperLength = 15;
        double wallpaperWidth = 1;

        double wallpaperArea = wallpaperLength * wallpaperWidth;
        double totalCleanArea = totalArea - wallpaperArea;

        System.out.println("Площадь стен комнаты за вычетом окна и двери = " + (totalCleanArea) + "м2, необхожимое количество обойных рулонов = " + Math.ceil(totalCleanArea / wallpaperArea));
    }
}
