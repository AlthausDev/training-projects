   M S B A M L   `   `   `  ����N  JVITP.09-ImageViewer, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null;"clr-namespace:VITP._09_ImageViewerVITP._09_ImageViewer  5   	   %    VITP._09_ImageViewer.MainWindow   5   	   W SPresentationCore, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35e aSystem.Windows.Controls.Ribbon, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089R NWindowsBase, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35^ ZWindowsFormsIntegration, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35H 9http://schemas.microsoft.com/winfx/2006/xaml/presentation      5   	   R NSystem.Xaml, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   4local"clr-namespace:VITP._09_ImageViewer     5   	     � Title$  
MainWindow��5   	   $	��450��6   $	��800��6)    � 	Resources 5	         ImageDataTemplate��%{   &	        �� 5
   
   .R�5      �� $	��180��6;   $	��180��6G   ��6   �� *UriSource.LocalPath+6G   5      5      .��5      �  � RowDefinitions 5   
   �� 5      $	��30* �6   �� 5      $
��300* �6   �� 5      $	��95* �6    � ColumnDefinitions 5   
   �� 5      $
��180* �6   �� 5      $
��340* �6   .+�5   
   �� -   5         ��Name$ listBox��5      $��1��6#   #��[  5      ��5   0   �� 5   D   o� 5   
   $��2��6   .@�5      m� $��_Directorio��6   .@�5      m� -   5        $��_Abrir��5      6+   5      5       �� 5"   
   -   5         ��Name$ image��5"      $��1��6   $
��Left=�6/   $	��300��6J   $��0,0,0,0q�6W   $��1��5#      $	��Top=�6   $	��520��65   �� 5%   
   $��1��6   $��2��6%   $��Center=�62    �� Orientation$ 
Horizontal=�6O   $��Center=�6h   .+�5&      �� -   5         ��Name$ BtnBN��5&      $	��B/N��6$   $��50��62   $
��10,0q�6=   6K   �� 5'      -   5        $ BtnBlur��5'      $
��Blur��6&   $��50��65   $
��10,0q�6@   6N   �� 5(      -   5        $ 	BtnRotate��5(      $��Rotar��6(   $��50��68   $
��10,0q�6C   6Q   �� 5)      -   5        $ BtnFlip��5)      $��Voltear��6&   $��50��68   $
��10,0q�6C   6Q   5*      5,      5-      