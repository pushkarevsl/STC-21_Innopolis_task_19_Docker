package main.web;

import com.sun.tools.javac.util.List;

import javax.ejb.Local;
import java.io.File;

@Local
public interface BeanRemote {

    List<String> pathToFolders(File file);
}
