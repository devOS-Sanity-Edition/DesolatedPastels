package one.devos.nautical.desolatedpastels.datagen

import com.klikli_dev.modonomicon.api.datagen.SingleBookSubProvider
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.datagen.book.guidebook.DesolatedCategory
import java.util.function.BiConsumer

class DesolatedPastelsBookProvider(defaultLang: BiConsumer<String, String>?) :
    SingleBookSubProvider("guidebook", DesolatedPastels.MOD_ID, defaultLang) {
    override fun registerDefaultMacros() {
        // nothing yet
    }

    override fun generateCategories() {
        this.add(DesolatedCategory(this).generate())
    }

    override fun bookName(): String {
        return "A Pastel Guide to the Softer and the Desolated"
    }

    override fun bookTooltip(): String {
        return "Everything you need to know about Softer Pastels and how to approach the Desolated Dimension"
    }
}