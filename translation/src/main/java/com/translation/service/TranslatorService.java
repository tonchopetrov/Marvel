package com.translation.service;

import java.io.IOException;

public interface TranslatorService {

    String translate(String targetLanguage, String text) throws IOException;
}
