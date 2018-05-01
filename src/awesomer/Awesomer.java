package awesomer;

import com.intellij.ide.DataManager;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.util.ui.UIUtil;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Awesomer {
    private Project project;
    private DataManager dataManager;
    DataContext dataContext;

    public static void main(String args[]) {
        Awesomer A = new Awesomer();

    }

    public Awesomer() {

        Application app = ApplicationManager.getApplication();
        System.out.println(app);
        //        this.project = DataKeys.PROJECT.getData(dataContext);
//        System.out.println("##########");
//        String filepath = "./src/awesome/console/AwesomeLinkFilter.java";
//        Map<String, List<VirtualFile>> myFileCache = new HashMap<>();
//        Map<String, List<VirtualFile>> myFileBaseCache = new HashMap<>();
//        ProjectManager projectManager = ProjectManager.getInstance();
//        Project p = ProjectManager.getInstance().getOpenProjects()[0];
    }
}
