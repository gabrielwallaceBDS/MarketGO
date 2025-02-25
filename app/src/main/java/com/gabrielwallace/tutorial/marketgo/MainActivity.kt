package com.gabrielwallace.tutorial.marketgo

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.gabrielwallace.tutorial.marketgo.databinding.ActivityMainBinding
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentStatePagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.TabView
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        setupViews()
    }
    private fun setupViews(){
        val  tabLayout = binding.addTab
        val viewPager = binding.addViewpager

        TabLayoutMediator(tabLayout, viewPager){ tab, position ->
            tab.text = "novo texto"
        }.attach()

    }

}

class tabViewPagerAdapter(fa: FragmentActivity) :  FragmentStateAdapter(fa){

    override fun getItemCount(): Fragment {
        TODO("Not yet implemented")
    }
    override fun createFragment(position: Int): Fragment {
        TODO("Not yet Implemented")
    }
}

class MarketplaceFragment : Fragment() {}


/*val tabLayout: TabLayout = findViewById(R.id.add_tab)*/

/* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
     val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
     v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
     insets
 }*/