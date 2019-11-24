package main.web;

import javax.ejb.Stateless;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Stateless
public class Recursion  {

    public List pathToFolders(File file) {

        List<String> fileList = new ArrayList<> ( );
        File[] files = file.listFiles ( );

        assert files != null;        //////? идея сначало ворнинг кидала, а потом этот ассерт нарисовала.
        for (File fileAr : files) {
            if (fileAr != null) {
                if (!fileAr.isDirectory ( )) {
                    System.out.println (fileAr.getName ( ));
                    fileList.add (fileAr.getName ());
                }
                if (fileAr.isDirectory ( )) {
                    pathToFolders (fileAr);
                }
            } else {
                throw new NullPointerException ( );
            }
        }
        return fileList;
    }
}
