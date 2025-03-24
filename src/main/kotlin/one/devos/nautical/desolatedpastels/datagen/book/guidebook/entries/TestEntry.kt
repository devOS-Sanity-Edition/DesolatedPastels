package one.devos.nautical.desolatedpastels.datagen.book.guidebook.entries

import com.klikli_dev.modonomicon.api.datagen.CategoryProviderBase
import com.klikli_dev.modonomicon.api.datagen.EntryBackground
import com.klikli_dev.modonomicon.api.datagen.EntryProvider
import com.klikli_dev.modonomicon.api.datagen.book.BookIconModel
import com.klikli_dev.modonomicon.api.datagen.book.page.BookTextPageModel
import com.mojang.datafixers.util.Pair
import net.minecraft.world.item.Items

class TestEntry(parent: CategoryProviderBase?) : EntryProvider(parent) {
    override fun generatePages() {
        this.page(
            "page1"
        ) {
            BookTextPageModel.create()
                .withTitle(context().pageTitle())
                .withText(context().pageText())
        }

        this.pageTitle("Basic Formatting")


        // \s tells java to keep the spaces at the end of the line. Otherwise it will remove.
        // Due to markdown using multiple spaces to indicate a line break, we need to keep the spaces.
        this.pageText(
            """
                **This is bold**      
                *This is italics*     
                ++This is underlined++
                
                """.trimIndent()
        )

        this.page(
            "page2"
        ) {
            BookTextPageModel.create()
                .withText(context().pageText())
        }
        this.pageText(
            """
                ~~This is stricken through~~    
                {0}
                
                """.trimIndent(),
            this.color("Colorful Text!", 0x55FF55)
        )
    }

    override fun entryName(): String {
        return "Test Entry"
    }

    override fun entryDescription(): String {
        return "This entry is a test!"
    }

    override fun entryBackground(): Pair<Int, Int> {
        return EntryBackground.DEFAULT
    }

    override fun entryIcon(): BookIconModel {
        return  BookIconModel.create(Items.PAPER)
    }

    override fun entryId(): String {
        return "test"
    }
}