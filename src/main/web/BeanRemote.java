package main.web;

import javax.ejb.Local;
import java.io.File;

@Local
public interface BeanRemote {

    File[] pathToFolders(File file);
}
