package com.vo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * \Date: 2018/1/25
 * \
 * \Description:
 * \
 */
public class TextEditor {
    private SpellChecker spellChecker;
    @Autowired
    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
