package ie.wit.donationx.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class DonationModel(var _id: String = "N/A",
                         @SerializedName("paymenttype")
                         var paymentmethod: String = "N/A",
                         var amount: Int = 0,
                         val message: String = "n/a") : Parcelable