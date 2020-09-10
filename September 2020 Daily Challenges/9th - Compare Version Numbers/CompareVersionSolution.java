public class CompareVersionSolution {
    public static int compareVersion(String version1, String version2) {

        // Split version strings up into there parts
        String[] versionOneBreakDown = version1.split("\\.");
        String[] versionTwoBreakDown = version2.split("\\.");

        int greatestLength;
        if(versionOneBreakDown.length > versionTwoBreakDown.length){
            greatestLength = versionOneBreakDown.length;
        } else {
            greatestLength = versionTwoBreakDown.length;
        }

        for (int i = 0; i < greatestLength; i++) {
            int v1 = i < versionOneBreakDown.length ? Integer.parseInt(versionOneBreakDown[i]) : 0;
            int v2 = i < versionTwoBreakDown.length ? Integer.parseInt(versionTwoBreakDown[i]) : 0;

            if(v1 > v2){
                return 1;
            }else if (v1 < v2){
                return -1;
            }
        }

        return 0;
    }
}
