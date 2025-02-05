package Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Composite {
    public static void main(String[] args) {
        FileSystem f1 = new files(120 , "Ca");
        folder folder1 = new folder("Dong vat");
        folder1.addFile(f1);
        System.out.println(folder1.size());
    }
    public static interface  FileSystem {
        public int size();
    }
    public static class files implements FileSystem {
        private int size;
        private String name;

        public files(int size, String name) {
            this.size = size;
            this.name = name;
        }

        @Override
        public int size() {
            return this.size;
        }
    }
    public static class folder implements FileSystem {
        private String name;
        private List<FileSystem> ListFile;

        public folder(String name) {
            this.name = name;
            this.ListFile = new ArrayList<>();
        }
        public boolean addFile (FileSystem fileSystem) {
           if (fileSystem != null) {
               ListFile.add(fileSystem);
               return true;
           }
        return false;
        }
        @Override
        public int size() {
            int sum = 0;
            for(FileSystem fileSystem : ListFile) {
                sum +=   fileSystem.size();
            }
            return sum;
        }
    }
}
