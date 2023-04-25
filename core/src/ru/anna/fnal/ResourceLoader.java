package ru.anna.fnal;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

import java.io.InputStream;

public class ResourceLoader {
    public static InputStream load(String path) {
        InputStream input = Gdx.files.internal(path).read();
        if(input == null) {
            input = Gdx.files.internal("/" + path).read();
        }
        return input;
    }
}
