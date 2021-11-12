package ie.wit.donationx.ui.detail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import ie.wit.donationx.R
import ie.wit.donationx.databinding.FragmentDonateBinding
import ie.wit.donationx.databinding.FragmentDonationDetailBinding
import ie.wit.donationx.ui.report.ReportViewModel

class DonationDetailFragment : Fragment() {
    private val args by navArgs<DonationDetailFragmentArgs>()
    private var _fragBinding: FragmentDonationDetailBinding? = null
    // This property is only valid between onCreateView and onDestroyView.
    private val fragBinding get() = _fragBinding!!

    companion object {
        fun newInstance() = DonationDetailFragment()
    }

    private lateinit var viewModel: DonationDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _fragBinding = FragmentDonationDetailBinding.inflate(inflater, container, false)
        val root = fragBinding.root

        val view = inflater.inflate(R.layout.fragment_donation_detail, container, false)

        Toast.makeText(context,"Donation ID Selected : ${args.donationid}",Toast.LENGTH_LONG).show()

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val donationDetailViewModel = ViewModelProvider(this).get(DonationDetailViewModel::class.java)
        donationDetailViewModel.observableDonation.observe(viewLifecycleOwner, Observer {

            fragBinding.editAmount.setText("amount")
            fragBinding.editMessage.setText("message")
            fragBinding.editPaymenttype.setText("payment")
            fragBinding.editUpvotes.setText("votes")

        })
    }

}