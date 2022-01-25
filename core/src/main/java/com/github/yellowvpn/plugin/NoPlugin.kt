package com.github.yellowvpn.plugin

import com.github.yellowvpn.Core.app

object NoPlugin : Plugin() {
    override val id: String get() = ""
    override val label: CharSequence get() = app.getText(com.github.yellowvpn.core.R.string.plugin_disabled)
}
