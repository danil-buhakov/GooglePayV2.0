package com.skillup.bigdig.googlepayv2.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.skillup.bigdig.googlepayv2.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class DetailViewPagerFragment extends Fragment {

  Unbinder unbinder;

  @BindView(R.id.vp_detail_fragments)
  ViewPager vpDetailFragments;

  @BindView(R.id.tl_detail_fragments)
  TabLayout tlDetailFragments;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    View v = inflater.inflate(R.layout.fragment_detail_viewpager, container, false);
    unbinder = ButterKnife.bind(this, v);
    return v;
  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    vpDetailFragments.setAdapter(new DetailFragmentAdapter(getActivity().getSupportFragmentManager()));
    tlDetailFragments.setupWithViewPager(vpDetailFragments);
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
    unbinder.unbind();
  }
}