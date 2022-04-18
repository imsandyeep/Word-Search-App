package com.aar.app.sandeep.data.room

import androidx.room.TypeConverter
import com.aar.app.sandeep.model.UsedWord.AnswerLine

object AnswerLineConverter {
    @JvmStatic
    @TypeConverter
    fun answerLineToString(answerLine: AnswerLine?): String? {
        return answerLine?.toString()
    }

    @JvmStatic
    @TypeConverter
    fun stringToAnswerLine(answerLineData: String?): AnswerLine? {
        if (answerLineData == null) return null
        val answerLine = AnswerLine()
        answerLine.fromString(answerLineData)
        return answerLine
    }
}