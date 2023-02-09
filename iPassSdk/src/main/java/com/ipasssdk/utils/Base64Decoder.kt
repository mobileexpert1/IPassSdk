package com.ipasssdk.utils
import android.os.Build
import androidx.annotation.RequiresApi
import java.util.Base64

@RequiresApi(Build.VERSION_CODES.O)
fun decodedString(decodedValue: String): String {
    return String(Base64.getDecoder().decode(decodedValue))
}
