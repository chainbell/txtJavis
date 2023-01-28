package com.javis.txt.app.service;

import java.util.List;

public interface MessageService {

    List getMessge(String authKey);

    boolean setMessage(String authKey, String message);

}
