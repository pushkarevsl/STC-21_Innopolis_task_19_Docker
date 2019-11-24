package main.web;

import javax.ejb.Stateless;
import java.io.File;

@Stateless
public class PathToFolder implements BeanRemote {

    @Override
    public File[] pathToFolders(File nameFile) {

        File[] files = nameFile.listFiles ( );
        assert files != null;                       //////? идея сначало ворнинг кидала, а потом этот ассерт нарисовала.
        for (File file : files) {
            if (file != null) {
                if (!file.isDirectory ( )) {
                    System.out.println (file.getName ( ));
                }
                if (file.isDirectory ( )) {
                    pathToFolders (file);
                }
            } else {
                throw new NullPointerException ( );
            }
        }
        return files;
    }
}
