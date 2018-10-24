package model.save;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.ArrayList;

public class SaveNLoad {

    private ArrayList<Memento> savedGamesList = new ArrayList<>();
    private XStream xStream;
    private File file;

    public void addGameMemo(Memento memento){

        savedGamesList.add(memento);
    }

    public Memento retrievegameMemo(Memento memento){

        return savedGamesList.get(savedGamesList.indexOf(memento));
    }

    public void serializeGamesList(){

        xStream = new XStream(new DomDriver()) ;
        String xml ;
        xml = xStream.toXML(this.savedGamesList);
        try {
            PrintWriter writer = new PrintWriter("game.xml");
            writer.write(xml);
            writer.close();
            XStream x = new XStream();
            String xml2 = new String(Files.readAllBytes(FileSystems.getDefault().getPath("game.xml")));
            ArrayList<Memento> m = (ArrayList<Memento>) x.fromXML(xml2);
            System.out.println(m.toString());
        } catch (Exception ex) {
            System.out.println("inside save : error");
            ex.printStackTrace();
        }




    }



}
