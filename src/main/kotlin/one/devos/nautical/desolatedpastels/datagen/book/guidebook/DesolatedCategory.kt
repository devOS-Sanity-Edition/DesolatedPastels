package one.devos.nautical.desolatedpastels.datagen.book.guidebook

import com.klikli_dev.modonomicon.api.datagen.CategoryProvider
import com.klikli_dev.modonomicon.api.datagen.ModonomiconProviderBase
import com.klikli_dev.modonomicon.api.datagen.SingleBookSubProvider
import com.klikli_dev.modonomicon.api.datagen.book.BookIconModel
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks
import one.devos.nautical.desolatedpastels.datagen.book.guidebook.entries.TestEntry

class DesolatedCategory(parent: SingleBookSubProvider?) : CategoryProvider(parent) {
    override fun categoryId(): String {
        return "desolated"
    }

    override fun generateEntryMap(): Array<String> {
        return arrayOf(
            "--------------------",
            "-a------------------",
            "--------------------",
            "--------------------",
            "--------------------",
            "--------------------",
            "--------------------",
            "--------------------")
    }

    override fun generateEntries() {
        val testEntry = this.add(TestEntry(this).generate("a"))
    }

    override fun categoryName(): String {
        return "Desolated"
    }

    override fun categoryIcon(): BookIconModel {
        return BookIconModel.create(DesolatedPastelsBlocks.PASTEL_GRASS)
    }
}