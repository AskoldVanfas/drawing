package com.example.drawing.feature.screen.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.drawing.R
import com.example.drawing.feature.screen.tools.Item
import com.example.drawing.feature.screen.tools.Tool
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class ScreenFragment : Fragment(R.layout.screen_fragment) {
    private val viewModel by viewModel<ScreenViewModel>()

    val toolsAdapter = ListDelegationAdapter<List<Item>>(
        toolAdapterDelegate {
              viewModel.processUiEvent(UiEvent.SelectedItem(it))

        },
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.viewState.observe(viewLifecycleOwner, ::render)
        view.findViewById<RecyclerView>(R.id.recycler).adapter = toolsAdapter
    }

    private fun render(viewState: ViewState) {
        toolsAdapter.items= viewState.tools
        toolsAdapter.notifyDataSetChanged()
        requireView().findViewById<CustomDrawView>(R.id.drawer1).render(viewState)
    }
}