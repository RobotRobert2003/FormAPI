package com.denzelcode.form.window;

import cn.nukkit.Player;

public interface IWindowForm {

    String getName();

    void sendTo(Player player);

    boolean wasClosed();

    boolean isValid(String formName);
}
