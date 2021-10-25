package ie.wit.donationx.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ie.wit.donationx.R
import ie.wit.donationx.databinding.FragmentAboutusBinding
import ie.wit.donationx.main.DonationXApp


class AboutusFragment : Fragment() {

    lateinit var app: DonationXApp
    private var _fragBinding: FragmentAboutusBinding? = null
    private val fragBinding get() = _fragBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        app = activity?.application as DonationXApp

        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _fragBinding = FragmentAboutusBinding.inflate(inflater, container, false)
        val root = fragBinding.root
        activity?.title = getString(R.string.action_about)

        return root;
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            AboutusFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}