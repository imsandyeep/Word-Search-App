package com.aar.app.sandeep.features.gameplay

import com.aar.app.sandeep.commons.Mapper
import com.aar.app.sandeep.custom.StreakView.StreakLine
import com.aar.app.sandeep.model.UsedWord.AnswerLine

/**
 * Created by abdularis on 09/07/17.
 */
class StreakLineMapper : Mapper<AnswerLine, StreakLine>() {
    override fun map(obj: AnswerLine): StreakLine {
        return StreakLine().apply {
            startIndex.set(obj.startRow, obj.startCol)
            endIndex.set(obj.endRow, obj.endCol)
            color = obj.color
        }
    }

    override fun revMap(obj: StreakLine): AnswerLine {
        return AnswerLine(
            startRow = obj.startIndex.row,
            startCol = obj.startIndex.col,
            endRow = obj.endIndex.row,
            endCol = obj.endIndex.col,
            color = obj.color
        )
    }
}