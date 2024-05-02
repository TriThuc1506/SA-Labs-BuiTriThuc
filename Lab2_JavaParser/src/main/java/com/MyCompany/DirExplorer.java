package com.MyCompany;

import java.io.File;

public class DirExplorer {

  public interface FileHandler {

    void Handle(int level, String path, File file);
  }

  public interface Filter {

    boolean interested(int level, String path, File file);
  }


  private Filter filter;
  private FileHandler fileHandler;

  public DirExplorer(Filter filter, FileHandler fileHandler) {
    this.filter = filter;
    this.fileHandler = fileHandler;
  }

  public void explore(File root) {
    explore(0,"",root);

  }

  private void explore(int level, String path, File file) {
    if (file.isDirectory()) {
      for (File child : file.listFiles()) {
        explore(level + 1, path + "/" + child.getName(), child);
      }
    } else {
      if (filter.interested(level, path, file)) {
        fileHandler.Handle(level, path, file);
      }
    }
  }
}
