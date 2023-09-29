class Main {
    public static void main(String[] args) {
        // Example 1: Using the first method with extra buckets
        int bucketsNeeded1 = PaintJob.getBucketCount(3.4, 2.1, 1.5, 2);
        System.out.println("Buckets needed (with extra buckets): " + bucketsNeeded1);

        // Example 2: Using the second method without extra buckets
        int bucketsNeeded2 = PaintJob.getBucketCount(3.4, 2.1, 1.5);
        System.out.println("Buckets needed (without extra buckets): " + bucketsNeeded2);

        // Example 3: Using the third method with total area
        int bucketsNeeded3 = PaintJob.getBucketCount(6.26, 2.2);
        System.out.println("Buckets needed (using total area): " + bucketsNeeded3);
    }
}


public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1; // Invalid input
        }

        double wallArea = width * height;
        double bucketsNeeded = Math.ceil(wallArea / areaPerBucket);

        return (int) (bucketsNeeded - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1; // Invalid input
        }

        double wallArea = width * height;
        double bucketsNeeded = Math.ceil(wallArea / areaPerBucket);

        return (int) bucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1; // Invalid input
        }

        double bucketsNeeded = Math.ceil(area / areaPerBucket);

        return (int) bucketsNeeded;
    }
}
